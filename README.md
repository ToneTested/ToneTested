<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ToneTested - Guitar Reviews</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <header>
    <h1>ToneTested</h1>
    <p>Your trusted source for guitar reviews and tutorials</p>
  </header>

  <nav>
    <ul>
      <li><a href="#reviews">Reviews</a></li>
      <li><a href="#tutorials">Tutorials</a></li>
      <li><a href="#contact">Contact</a></li>
    </ul>
  </nav>

  <main>
    <section id="reviews">
      <h2>Guitar Reviews</h2>
      <article>
        <h3>Fender Stratocaster</h3>
        <p>The Fender Stratocaster is a timeless classic, offering incredible tone and versatility.</p>
      </article>
      <article>
        <h3>Gibson Les Paul</h3>
        <p>The Gibson Les Paul delivers a warm, rich sound that is perfect for rock and blues players.</p>
      </article>
    </section>

    <section id="tutorials">
      <h2>Tutorials</h2>
      <p>Coming soon: Learn how to master your favorite riffs and techniques!</p>
    </section>
  </main>

  <footer id="contact">
    <p>&copy; 2025 ToneTested. All rights reserved.</p>
    <p>Contact: <a href="mailto:info@tonetested.com">info@tonetested.com</a></p>
  </footer>
</body>
</html>


/* General styles */
body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  line-height: 1.6;
  color: #333;
}

/* Header styles */
header {
  text-align: center;
  background-color: #444;
  color: white;
  padding: 1.5rem 0;
}

header h1 {
  margin: 0;
  font-size: 2.5rem;
}

header p {
  margin: 0.5rem 0;
  font-size: 1rem;
}

/* Navigation styles */
nav {
  background-color: #222;
}

nav ul {
  list-style: none;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
}

nav ul li {
  margin: 0;
}

nav ul li a {
  display: block;
  padding: 1rem;
  color: white;
  text-decoration: none;
}

nav ul li a:hover {
  background-color: #555;
}

/* Main content styles */
main {
  padding: 1rem;
}

section {
  margin: 2rem 0;
}

article {
  margin-bottom: 1.5rem;
  padding: 1rem;
  border: 1px solid #ccc;
  border-radius: 5px;
}

/* Footer styles */
footer {
  text-align: center;
  background-color: #222;
  color: white;
  padding: 1rem 0;
}

footer a {
  color: #4CAF50;
  text-decoration: none;
}

footer a:hover {
  text-decoration: underline;
}