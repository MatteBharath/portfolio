import React from 'react';
import styles from './Contact.module.css';

function Contact() {
  return (
    <section id="contact" className={`section ${styles.contact} reveal`}>
      <div className="container">
        <p className="section-label">05. let's build your next project</p>
        <h2 className={styles.heading}>Get In <span>Touch</span></h2>
        <p className={styles.sub}>
          I'm currently open to new opportunities. Whether you have a question,
          a project idea, or just want to say hi — my inbox is always open to
          building your next immersive experience.
        </p>

        <a
          href="mailto:bharathmatte2707@gmail.com"
          className={styles.btn}
        >
          Say Hello
        </a>

        <div className={styles.links}>
          <a
            href="mailto:bharathmatte2707@gmail.com"
            className={styles.link}
            aria-label="Email"
          >
            <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8">
              <rect x="2" y="4" width="20" height="16" rx="2"/>
              <path d="M2 7l10 7 10-7"/>
            </svg>
            bharathmatte2707@gmail.com
          </a>
          <a href="tel:+918317618853" className={styles.link} aria-label="Phone">
            <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8">
              <path d="M22 16.92v3a2 2 0 01-2.18 2 19.79 19.79 0 01-8.63-3.07A19.5 19.5 0 013.07 9.8a19.79 19.79 0 01-3.07-8.67A2 2 0 012 .82h3a2 2 0 012 1.72 12.84 12.84 0 00.7 2.81 2 2 0 01-.45 2.11L6.09 8.91a16 16 0 006 6l1.27-1.27a2 2 0 012.11-.45 12.84 12.84 0 002.81.7A2 2 0 0122 16.92z"/>
            </svg>
            +91 8317618853
          </a>
          <span className={styles.link}>
            <svg width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="1.8">
              <path d="M21 10c0 7-9 13-9 13S3 17 3 10a9 9 0 0118 0z"/>
              <circle cx="12" cy="10" r="3"/>
            </svg>
            Bangalore, 560093
          </span>
        </div>
      </div>
      <footer className={styles.footer}>
        <p>Built by <span>Matte Bharath</span> · React + Vite</p>
      </footer>
    </section>
  );
}

export default Contact;
