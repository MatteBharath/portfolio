import { useEffect } from 'react';

function useScrollReveal() {
  useEffect(() => {
    if (typeof window === 'undefined') return;

    const revealElements = Array.from(document.querySelectorAll('.reveal'));
    if (revealElements.length === 0) return;

    const options = {
      threshold: 0.15,
      rootMargin: '0px 0px -80px 0px',
    };

    const observer = new IntersectionObserver((entries) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          entry.target.classList.add('active');
          observer.unobserve(entry.target);
        }
      });
    }, options);

    revealElements.forEach((el) => observer.observe(el));

    return () => observer.disconnect();
  }, []);
}

export default useScrollReveal;
