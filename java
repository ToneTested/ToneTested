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
  }
];

const reviewList = document.getElementById("review-list");
const form = document.getElementById("reviewForm");

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

form.addEventListener("submit", function (e) {
  e.preventDefault();
  const model = document.getElementById("model").value;
  const brand = document.getElementById("brand").value;
  const rating = parseInt(document.getElementById("rating").value);
  const content = document.getElementById("content").value;

  reviews.unshift({ brand, model, rating, content });
  renderReviews();
  form.reset();
});

renderReviews();