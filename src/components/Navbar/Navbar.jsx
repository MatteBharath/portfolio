import React, { useState, useEffect } from 'react';
import styles from './Navbar.module.css';

const links = [
  { label: 'About', href: '#about' },
  { label: 'Experience', href: '#experience' },
  { label: 'Skills', href: '#skills' },
  { label: 'Projects', href: '#projects' },
  { label: 'Contact', href: '#contact' },
];

function Navbar() {
  const [scrolled, setScrolled] = useState(false);
  const [menuOpen, setMenuOpen] = useState(false);

  useEffect(() => {
    const handler = () => setScrolled(window.scrollY > 40);
    window.addEventListener('scroll', handler);
    return () => window.removeEventListener('scroll', handler);
  }, []);

  return (
    <nav className={`${styles.nav} ${scrolled ? styles.scrolled : ''}`}>
      <div className={styles.inner}>
        <a href="#hero" className={styles.brand}>
          <span className={styles.brandBracket}>&lt;</span>
          MB
          <span className={styles.brandBracket}>/&gt;</span>
        </a>

        <ul className={`${styles.links} ${menuOpen ? styles.open : ''}`}>
          {links.map(l => (
            <li key={l.href}>
              <a href={l.href} onClick={() => setMenuOpen(false)}>{l.label}</a>
            </li>
          ))}
          <li>
            <a
              href="mailto:bharathmatte2707@gmail.com"
              className={styles.cta}
            >
              Hire Me
            </a>
          </li>
        </ul>

        <button
          className={styles.burger}
          onClick={() => setMenuOpen(o => !o)}
          aria-label="Toggle menu"
        >
          <span className={menuOpen ? styles.line1Open : styles.line1} />
          <span className={menuOpen ? styles.line2Open : styles.line2} />
          <span className={menuOpen ? styles.line3Open : styles.line3} />
        </button>
      </div>
    </nav>
  );
}

export default Navbar;
