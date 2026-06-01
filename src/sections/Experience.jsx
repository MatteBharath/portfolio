import React, { useState } from 'react';
import styles from './Experience.module.css';

const jobs = [
  {
    id: 'fio',
    company: 'FIO Labs Pvt Ltd',
    role: 'Full Stack Developer',
    period: 'May 2025 – Present',
    type: 'Full-time',
    highlights: [
      'Built a multi-role purchase request review system with role-based phase routing, event sourcing for audit trails, and real-time status tracking across 20+ lifecycle states.',
      'Implemented multi-language support (EN/DE/ES) using i18next across all modules.',
      'Designed event-driven microservices architecture using Apache Kafka and Spring Cloud Stream for real-time business events across distributed services.',
      'Built JPA read/write model separation (CQRS) and Kafka event consumers with DLQ recovery and retry strategies for fault-tolerant event processing.',
      'Maintained a typed Axios service layer with JWT interceptors and OpenAPI-generated TypeScript models; designed RESTful APIs using OpenAPI 3.0 with Spring Boot code generation.',
      'Applied controller/hook separation — custom hooks own data fetching; controllers handle business logic, keeping components fully presentational.',
      'Built a multi-stage LLM extraction pipeline using GPT-4o Vision to parse invoices and quotation PDFs into structured JSON — handling scanned documents, tax, discounts, and supplier data via prompt engineering.',
      'Orchestrated a three-stage LLM pipeline (Entities → Items → Categories) using LangGraph; enforced strict output validation via OpenAI response_format: json_schema with Pydantic schema binding.',
      'Implemented human-in-the-loop review — users can reject LLM output and provide correction feedback; LLM re-extracts with context, managed via Redis session checkpointing and FastAPI endpoints.',
      'Accelerated development and code quality using Claude (Anthropic), Cursor AI, and OpenAI Codex for code generation, review, and technical writing.',
    ],
    stack: ['React', 'TypeScript', 'Spring Boot', 'Java', 'Apache Kafka', 'FastAPI', 'LangGraph', 'GPT-4o', 'Redis', 'PostgreSQL', 'OpenAPI 3.0', 'CQRS', 'Docker'],
  },
  {
    id: 'ormat',
    company: 'Ormat Technologies Pvt. Ltd.',
    role: 'Frontend Developer (Freelance)',
    period: 'March 2024 – April 2025',
    type: 'Freelance',
    highlights: [
      'Built real-time vehicle tracking dashboard with live location, speed, and route history using Google Maps API and Firebase Realtime Database.',
      'Implemented geofencing with circle and polygon zones and automated alerts for zone entry/exit events.',
      'Integrated C3.js interactive charts for live and historical fuel level and speed data with region highlights, grid lines, and smooth updates.',
      'Connected sensor data for fuel and odometer tracking to detect fuel theft and overconsumption; built pre/post-trip inspection checklists for compliance.',
      'Built responsive cross-browser UI with Material-UI and EUI; tracked driver behaviour including overspeeding, idling, and checklist adherence.',
      'Worked in Agile sprints using Git for version control; collaborated with UI/UX designers to convert mockups into production-ready interfaces.',
    ],
    stack: ['React.js', 'JavaScript', 'Firebase', 'Google Maps API', 'Material-UI', 'EUI', 'C3.js'],
  },
];

function Experience() {
  const [active, setActive] = useState('fio');
  const job = jobs.find(j => j.id === active);

  return (
    <section id="experience" className={`section ${styles.experience} reveal`}>
      <div className="container">
        <p className="section-label">02. delivery</p>
        <h2 className="section-title">Work <span>Experience</span></h2>

        <div className={styles.layout}>
          <div className={styles.tabs}>
            {jobs.map(j => (
              <button
                key={j.id}
                className={`${styles.tab} ${active === j.id ? styles.tabActive : ''}`}
                onClick={() => setActive(j.id)}
              >
                {j.company}
              </button>
            ))}
          </div>

          <div className={styles.panel}>
            <div className={styles.panelHeader}>
              <h3 className={styles.roleTitle}>
                {job.role}{' '}
                <span className={styles.atCompany}>@ {job.company}</span>
              </h3>
              <div className={styles.meta}>
                <span className={styles.period}>{job.period}</span>
                <span className="tag">{job.type}</span>
              </div>
            </div>

            <ul className={styles.highlights}>
              {job.highlights.map((h, i) => (
                <li key={i}>{h}</li>
              ))}
            </ul>

            <div className={styles.stackRow}>
              {job.stack.map(s => (
                <span key={s} className="tag">{s}</span>
              ))}
            </div>
          </div>
        </div>
      </div>
    </section>
  );
}

export default Experience;
