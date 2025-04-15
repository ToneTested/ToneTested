<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Guitar Reviews</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <header>
    <h1>Welcome to Tone Tested</h1>
    <p>Your trusted source for guitar reviews</p>
  </header>

  <nav>
    <a href="#home">Home</a>
    <a href="#reviews">Reviews</a>
    <a href="#about">About</a>
    <a href="#contact">Contact</a>
  </nav>

  <main>
    <div class="review-card">
      <img src="guitar1.jpg" alt="Guitar Image">
      <h2>Fender Stratocaster Review</h2>
      <p>The Fender Stratocaster is a timeless classic...</p>
    </div>

    <div class="review-card">
      <img src="guitar2.jpg" alt="Guitar Image">
      <h2>Gibson Les Paul Review</h2>
      <p>The Gibson Les Paul is known for its rich tones...</p>
    </div>
  </main>

  <footer>
    <p>&copy; 2025 Tone Tested. All rights reserved.</p>
  </footer>
</body>
</html>


/* General body style */
body {
  font-family: 'Arial', sans-serif;
  background-color: #f4f4f9;
  margin: 0;
  padding: 0;
  color: #333;
}

/* Header style */
header {
  background-color: #222;
  color: #fff;
  padding: 20px;
  text-align: center;
}

header h1 {
  font-size: 2.5rem;
  margin: 0;
}

header p {
  font-size: 1.2rem;
  margin: 5px 0 0;
}

/* Navigation bar */
nav {
  background-color: #444;
  overflow: hidden;
}

nav a {
  float: left;
  display: block;
  color: #fff;
  text-align: center;
  padding: 14px 20px;
  text-decoration: none;
}

nav a:hover {
  background-color: #666;
}

/* Main content area */
main {
  padding: 20px;
  max-width: 1200px;
  margin: auto;
}

/* Individual review cards */
.review-card {
  background-color: #fff;
  border: 1px solid #ddd;
  border-radius: 8px;
  margin: 20px 0;
  padding: 20px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

.review-card h2 {
  margin-top: 0;
  color: #444;
}

.review-card p {
  line-height: 1.6;
}

.review-card img {
  max-width: 100%;
  border-radius: 8px;
  margin-bottom: 15px;
}

/* Footer */
footer {
  background-color: #222;
  color: #fff;
  text-align: center;
  padding: 10px 0;
  position: relative;
  bottom: 0;
  width: 100%;
}