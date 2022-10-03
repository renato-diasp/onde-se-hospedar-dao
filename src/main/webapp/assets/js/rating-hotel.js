import renderStar from './rating.js';

const ratingBlueTreeEl = document.getElementById('rating-blue-tree');
const ratingConfortEl = document.getElementById('rating-confort');
const ratingMercure = document.getElementById('rating-mercure');

ratingBlueTreeEl.innerHTML = renderStar();
ratingConfortEl.innerHTML = renderStar(4);
ratingMercure.innerHTML = renderStar(4);