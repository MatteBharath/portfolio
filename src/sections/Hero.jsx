import React from 'react';
import styles from './Hero.module.css';

function Hero() {
  return (
    <section id="hero" className={`${styles.hero} reveal`}>
      <div className={styles.glow} />
      <div className="container">
        <div className={styles.grid}>
          <div className={styles.left}>
            <p className={styles.greeting}>Hi, my name is</p>
            <h1 className={styles.name}>Matte Bharath.</h1>
            <h2 className={styles.title}>I build things for the web.</h2>
            <p className={styles.bio}>
              Full-stack developer with 2 years of experience building production-grade
              web applications across frontend and backend. I work with{' '}
              <span>React</span>, <span>TypeScript</span>,{' '}
              <span>Spring Boot</span>, and event-driven microservices to deliver
              clean, scalable solutions.
            </p>
            <div className={styles.actions}>
              <a href="#projects" className={styles.btnPrimary}>Explore Company Work</a>
              <a href="mailto:bharath.matte.b@gmail.com" className={styles.btnOutline}>
                Let&apos;s Talk
              </a>
            </div>
          </div>

          <aside className={styles.preview}>
            <div className={styles.cardStack}>
              <div className={`${styles.card} ${styles.cardOne}`}>
                <span className={styles.cardHeader}>Layered View</span>
                <p className={styles.cardText}>
                  Interfaces with layered depth, soft glow accents, and subtle motion
                  that feel modern, polished, and highly professional.
                </p>
              </div>

              <div className={`${styles.card} ${styles.cardTwo}`}>
                <span className={styles.cardBadge}>Architecture</span>
                <h3 className={styles.cardTitle}>Flexible systems</h3>
                <p className={styles.cardText}>
                  Clean engineering across frontend and backend layers for resilient,
                  production-grade delivery.
                </p>
              </div>

              <div className={`${styles.card} ${styles.cardThree}`}>
                <span className={styles.cardBadge}>Delivery</span>
                <h3 className={styles.cardTitle}>Polished execution</h3>
                <p className={styles.cardText}>
                  Experience-driven product work with strong attention to detail,
                  performance, and real-world business outcomes.
                </p>
              </div>
            </div>
          </aside>
        </div>
      </div>
    </section>
  );
}

export default Hero;
