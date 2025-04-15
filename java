const reviews = [
  {
    brand: "Fender",
    model: "Stratocaster",
    rating: 5,
    content: "Classic tone and feel. Excellent for blues and rock."
  },
  {
    brand: "Gibson",
    model: "Les Paul Standard",
    rating: 4,
    content: "Heavy, but the tone is unmatched. Great sustain."
  },
  {
    brand: "PRS",
    model: "Custom 24",
    rating: 5,
    content: "Incredible versatility and craftsmanship. Great for any genre."
  }
];

const reviewList = document.getElementById("review-list");

function renderReviews() {
  reviewList.innerHTML = "";
  reviews.forEach(review => {
    const card = document.createElement("div");
    card.classList.add("review-card");
    card.innerHTML = `
      <h3>${review.brand} ${review.model}</h3>
      <p class="rating">Rating: ${'★'.repeat(review.rating)} (${review.rating}/5)</p>
      <p>${review.content}</p>
    `;
    reviewList.appendChild(card);
  });
}

renderReviews();