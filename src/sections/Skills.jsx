import React from 'react';
import styles from './Skills.module.css';

const categories = [
  {
    title: 'Frontend',
    icon: '🖥',
    skills: [
      'React.js', 'TypeScript', 'JavaScript (ES6+)',
      'HTML5', 'CSS3', 'Tailwind CSS',
      'Material-UI', 'EUI', 'i18next', 'C3.js', 'Google Maps API',
    ],
  },
  {
    title: 'Backend',
    icon: '⚙️',
    skills: [
      'Spring Boot', 'Java', 'Node.js',
      'Apache Kafka', 'Spring Cloud Stream',
      'Hibernate / JPA', 'REST APIs',
      'OpenAPI 3.0', 'CQRS',
    ],
  },
  {
    title: 'Database',
    icon: '🗄',
    skills: [
      'PostgreSQL', 'MongoDB', 'Firebase Realtime Database',
    ],
  },
  {
    title: 'Tools & Practices',
    icon: '🛠',
    skills: [
      'Git', 'Docker', 'Postman',
      'Agile / Scrum', 'Multi-tenant SaaS',
      'DLQ / Retry patterns', 'Event Sourcing',
    ],
  },
];

function Skills() {
  return (
    <section id="skills" className={`section ${styles.skills}`}>
      <div className="container">
        <p className="section-label">03. what I use</p>
        <h2 className="section-title">Tech <span>Stack</span></h2>

        <div className={styles.grid}>
          {categories.map(cat => (
            <div key={cat.title} className={styles.card}>
              <div className={styles.cardHeader}>
                <span className={styles.icon} aria-hidden="true">{cat.icon}</span>
                <h3 className={styles.catTitle}>{cat.title}</h3>
              </div>
              <div className={styles.tags}>
                {cat.skills.map(s => (
                  <span key={s} className={styles.skillTag}>{s}</span>
                ))}
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
}

export default Skills;
