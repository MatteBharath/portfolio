import React from 'react';
import styles from './Hero.module.css';

function Hero() {
  return (
    <section id="hero" className={styles.hero}>
      <div className={styles.glow} />
      <div className="container">
        <p className={styles.greeting}>Hi, my name is</p>
        <h1 className={styles.name}>Matte Bharath.</h1>
        <h2 className={styles.title}>I build things for the web.</h2>
        <p className={styles.bio}>
          Full-Stack Developer with 2 years of experience building production-grade web
          applications. Skilled in <span>React</span>, <span>TypeScript</span>,{' '}
          <span>Spring Boot</span>, and event-driven microservices on multi-tenant B2B
          SaaS platforms.
        </p>
        <div className={styles.actions}>
          <a href="#experience" className={styles.btnPrimary}>View My Work</a>
          <a href="mailto:bharathmatte2707@gmail.com" className={styles.btnOutline}>
            Get In Touch
          </a>
        </div>
      </div>
    </section>
  );
}

export default Hero;
