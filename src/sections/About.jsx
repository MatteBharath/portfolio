import React from 'react';
import styles from './About.module.css';

function About() {
  return (
    <section id="about" className={`section ${styles.about} reveal`}>
      <div className="container">
        <p className="section-label">01. about my work</p>
        <h2 className="section-title">Who I <span>Am</span></h2>

        <div className={styles.grid}>
          <div className={styles.text}>
            <p>
              I'm a full-stack developer based in Bangalore, India, with a passion for
              building scalable, production-grade web applications. I graduated with a
              degree in Computer Science from Rao Bahadur Y. Mahabaleshwarappa
              Engineering College (CGPA 7.41) in May 2023.
            </p>
            <p>
              Since then I've been working at <strong>FIO Labs</strong> building
              multi-tenant B2B SaaS platforms — shipping features end-to-end across
              the React/TypeScript frontend, Spring Boot microservices backend, and
              Kafka event-driven architecture.
            </p>
            <p>
              I care deeply about clean architecture, maintainable code, and
              collaborating closely with product and design to deliver polished
              product experiences with real business impact.
            </p>
            <ul className={styles.details}>
              <li><span>Name</span> Matte Bharath</li>
              <li><span>Location</span> Bangalore, 560093</li>
              <li><span>Email</span> bharathmatte2707@gmail.com</li>
              <li><span>Phone</span> +91 8317618853</li>
              <li><span>Available</span> <span className={styles.available}>Open to opportunities</span></li>
            </ul>

            <div className={styles.languages}>
              <p className={styles.langLabel}>Languages</p>
              <div className={styles.langList}>
                {['English', 'Telugu', 'Hindi', 'Kannada'].map(lang => (
                  <span key={lang} className={styles.langTag}>{lang}</span>
                ))}
              </div>
            </div>
          </div>

          <div className={styles.card}>
            <div className={styles.avatar}>MB</div>
            <div className={styles.stats}>
              <div className={styles.stat}>
                <strong>2+</strong>
                <span>Years Experience</span>
              </div>
              <div className={styles.stat}>
                <strong>20+</strong>
                <span>Lifecycle States Shipped</span>
              </div>
              <div className={styles.stat}>
                <strong>4</strong>
                <span>Spoken Languages</span>
              </div>
              <div className={styles.stat}>
                <strong>2</strong>
                <span>Production Apps</span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}

export default About;
