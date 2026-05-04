import React from 'react';
import Button from '../components/Button/Button';

function Home() {
  return (
    <main style={{ padding: '2rem' }}>
      <h1>Welcome Home</h1>
      <p>This is the home page of your React app.</p>
      <Button label="Click Me" onClick={() => alert('Hello!')} />
    </main>
  );
}

export default Home;
