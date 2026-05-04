import React from 'react';
import styles from './Projects.module.css';

const projects = [
  {
    title: 'Multi-Role Purchase Request System',
    description:
      'End-to-end purchase request review workflow for buyer, supplier, and tenant admin roles. Features role-based phase routing, event sourcing for audit trails, and real-time status tracking across 20+ lifecycle states.',
    stack: ['React', 'TypeScript', 'Spring Boot', 'Apache Kafka', 'PostgreSQL', 'OpenAPI 3.0'],
    type: 'B2B SaaS — FIO Labs',
  },
  {
    title: 'Integrator Billing Module',
    description:
      'Full billing module with list view and client-side filtering, bill detail screen with line items and events timeline, and a generate-bill workflow. Migrated to /invoices/api/v1/bills with zero breaking changes.',
    stack: ['React', 'TypeScript', 'Spring Boot', 'Java', 'CQRS', 'JPA'],
    type: 'B2B SaaS — FIO Labs',
  },
  {
    title: 'Customer Preference Management',
    description:
      'Dynamic preference UI with vendor model selection, payment terms, payout policies, date/time format preferences, and multi-currency configuration. Backed by a typed OpenAPI service layer.',
    stack: ['React', 'TypeScript', 'OpenAPI', 'i18next', 'REST APIs'],
    type: 'B2B SaaS — FIO Labs',
  },
  {
    title: 'Fleetor — Real-time Fleet Management',
    description:
      'Real-time vehicle tracking dashboard with live location, speed, and route history. Includes geofencing with circle and polygon zones, automated alerts, C3.js fuel/speed charts, and pre/post-trip inspection checklists.',
    stack: ['React.js', 'Firebase', 'Google Maps API', 'Material-UI', 'EUI', 'C3.js', 'JavaScript'],
    type: 'Freelance — Ormat Technologies',
  },
];

function Projects() {
  return (
    <section id="projects" className={`section ${styles.projects}`}>
      <div className="container">
        <p className="section-label">04. what I've built</p>
        <h2 className="section-title">Featured <span>Projects</span></h2>

        <div className={styles.grid}>
          {projects.map((p, i) => (
            <div key={i} className={styles.card}>
              <div className={styles.cardTop}>
                <span className={styles.folder}>
                  <svg width="40" height="40" viewBox="0 0 40 40" fill="none">
                    <path d="M6 10C6 8.9 6.9 8 8 8H16L20 12H32C33.1 12 34 12.9 34 14V30C34 31.1 33.1 32 32 32H8C6.9 32 6 31.1 6 30V10Z"
                      fill="rgba(56,189,248,0.12)" stroke="rgba(56,189,248,0.4)" strokeWidth="1.5" />
                  </svg>
                </span>
              </div>
              <h3 className={styles.title}>{p.title}</h3>
              <p className={styles.desc}>{p.description}</p>
              <div className={styles.footer}>
                <span className={styles.type}>{p.type}</span>
                <div className={styles.stack}>
                  {p.stack.map(s => (
                    <span key={s} className={styles.tech}>{s}</span>
                  ))}
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
}

export default Projects;
