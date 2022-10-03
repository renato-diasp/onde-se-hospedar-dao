<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
     prefix="c" %>
<jsp:useBean id="Hotel" type="model.Hotel" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./assets/css/reset.css">
  <link rel="stylesheet" href="./assets/css/styles.css">
  <link rel="stylesheet" href="./assets/css/hotel.css">
  <title><c:out value="${Hotel.name}" /></title>
</head>
<body>
  <header class="header">
    <section class="login-area">
      <li><a class="anchor" href="#">Login</a></li>
      <svg class="login-icon" width="52" height="46" viewBox="0 0 52 46" fill="none" xmlns="http://www.w3.org/2000/svg">
        <g clip-path="url(#clip0_138_332)">
        <path d="M35.7471 17.25C35.7471 19.5375 34.7295 21.7313 32.9183 23.3488C31.107 24.9663 28.6504 25.875 26.0889 25.875C23.5274 25.875 21.0708 24.9663 19.2595 23.3488C17.4482 21.7313 16.4307 19.5375 16.4307 17.25C16.4307 14.9625 17.4482 12.7687 19.2595 11.1512C21.0708 9.5337 23.5274 8.625 26.0889 8.625C28.6504 8.625 31.107 9.5337 32.9183 11.1512C34.7295 12.7687 35.7471 14.9625 35.7471 17.25Z" fill="#CFEDF2"/>
        <path fill-rule="evenodd" clip-rule="evenodd" d="M0.333496 23C0.333496 16.9 3.04698 11.0499 7.87702 6.73654C12.7071 2.42321 19.258 0 26.0887 0C32.9194 0 39.4704 2.42321 44.3004 6.73654C49.1304 11.0499 51.8439 16.9 51.8439 23C51.8439 29.1 49.1304 34.9501 44.3004 39.2635C39.4704 43.5768 32.9194 46 26.0887 46C19.258 46 12.7071 43.5768 7.87702 39.2635C3.04698 34.9501 0.333496 29.1 0.333496 23ZM26.0887 2.875C21.8448 2.8752 17.6872 3.94554 14.0945 5.96283C10.5018 7.98012 7.61991 10.8624 5.78061 14.2778C3.9413 17.6933 3.21932 21.5031 3.69777 25.2688C4.17621 29.0346 5.83562 32.6031 8.48502 35.5638C10.7708 32.2747 15.8027 28.75 26.0887 28.75C36.3747 28.75 41.4034 32.2719 43.6924 35.5638C46.3418 32.6031 48.0012 29.0346 48.4796 25.2688C48.9581 21.5031 48.2361 17.6933 46.3968 14.2778C44.5575 10.8624 41.6756 7.98012 38.0829 5.96283C34.4902 3.94554 30.3326 2.8752 26.0887 2.875Z" fill="#CFEDF2"/>
        </g>
        <defs>
        <clipPath id="clip0_138_332">
        <rect width="51.5104" height="46" fill="white" transform="translate(0.333496)"/>
        </clipPath>
        </defs>
      </svg>          
    </section>
  </header>
  <main class="main-hotel">
    <a class="go-to-home" href="/OndeSeHospedar/hotels">
      <svg width="16" fill="#276274" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M109.3 288L480 288c17.7 0 32-14.3 32-32s-14.3-32-32-32l-370.7 0 73.4-73.4c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0l-128 128c-12.5 12.5-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0s12.5-32.8 0-45.3L109.3 288z"/></svg>
      Voltar para página inicial
    </a>
    <h2 class="hotel-title">
    	<c:out value="${Hotel.name}" />
    </h2>
    <div class="container-image-hotel-info">
      <img class="blue-tree-image" src="<c:out value="${Hotel.imagePath}" />" alt="">
      <div class="container-hotel-info">
        <a class="oficial-link" target="_blank" href="<c:out value="${hotel.site}" />">
        	Visite o site oficial
        </a>
        <p class="daily-value">
        	<c:out value="Valor diária: R$ ${Hotel.price}" />
        </p>
        <p class="address">
          <c:out value="${Hotel.address}" />
        </p>
        <article class="description">
          <c:out value="${Hotel.description}" />
        </article>
      </div>
    </div>
    <div class="comment-title">Deixe um comentário:</div>
    <form class="comment-form">
      <div class="rating">
        <svg class="star empty" fill="#FFCE6A" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M287.9 0C297.1 0 305.5 5.25 309.5 13.52L378.1 154.8L531.4 177.5C540.4 178.8 547.8 185.1 550.7 193.7C553.5 202.4 551.2 211.9 544.8 218.2L433.6 328.4L459.9 483.9C461.4 492.9 457.7 502.1 450.2 507.4C442.8 512.7 432.1 513.4 424.9 509.1L287.9 435.9L150.1 509.1C142.9 513.4 133.1 512.7 125.6 507.4C118.2 502.1 114.5 492.9 115.1 483.9L142.2 328.4L31.11 218.2C24.65 211.9 22.36 202.4 25.2 193.7C28.03 185.1 35.5 178.8 44.49 177.5L197.7 154.8L266.3 13.52C270.4 5.249 278.7 0 287.9 0L287.9 0zM287.9 78.95L235.4 187.2C231.9 194.3 225.1 199.3 217.3 200.5L98.98 217.9L184.9 303C190.4 308.5 192.9 316.4 191.6 324.1L171.4 443.7L276.6 387.5C283.7 383.7 292.2 383.7 299.2 387.5L404.4 443.7L384.2 324.1C382.9 316.4 385.5 308.5 391 303L476.9 217.9L358.6 200.5C350.7 199.3 343.9 194.3 340.5 187.2L287.9 78.95z"/></svg>
        <svg class="star empty" fill="#FFCE6A" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M287.9 0C297.1 0 305.5 5.25 309.5 13.52L378.1 154.8L531.4 177.5C540.4 178.8 547.8 185.1 550.7 193.7C553.5 202.4 551.2 211.9 544.8 218.2L433.6 328.4L459.9 483.9C461.4 492.9 457.7 502.1 450.2 507.4C442.8 512.7 432.1 513.4 424.9 509.1L287.9 435.9L150.1 509.1C142.9 513.4 133.1 512.7 125.6 507.4C118.2 502.1 114.5 492.9 115.1 483.9L142.2 328.4L31.11 218.2C24.65 211.9 22.36 202.4 25.2 193.7C28.03 185.1 35.5 178.8 44.49 177.5L197.7 154.8L266.3 13.52C270.4 5.249 278.7 0 287.9 0L287.9 0zM287.9 78.95L235.4 187.2C231.9 194.3 225.1 199.3 217.3 200.5L98.98 217.9L184.9 303C190.4 308.5 192.9 316.4 191.6 324.1L171.4 443.7L276.6 387.5C283.7 383.7 292.2 383.7 299.2 387.5L404.4 443.7L384.2 324.1C382.9 316.4 385.5 308.5 391 303L476.9 217.9L358.6 200.5C350.7 199.3 343.9 194.3 340.5 187.2L287.9 78.95z"/></svg>
        <svg class="star empty" fill="#FFCE6A" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M287.9 0C297.1 0 305.5 5.25 309.5 13.52L378.1 154.8L531.4 177.5C540.4 178.8 547.8 185.1 550.7 193.7C553.5 202.4 551.2 211.9 544.8 218.2L433.6 328.4L459.9 483.9C461.4 492.9 457.7 502.1 450.2 507.4C442.8 512.7 432.1 513.4 424.9 509.1L287.9 435.9L150.1 509.1C142.9 513.4 133.1 512.7 125.6 507.4C118.2 502.1 114.5 492.9 115.1 483.9L142.2 328.4L31.11 218.2C24.65 211.9 22.36 202.4 25.2 193.7C28.03 185.1 35.5 178.8 44.49 177.5L197.7 154.8L266.3 13.52C270.4 5.249 278.7 0 287.9 0L287.9 0zM287.9 78.95L235.4 187.2C231.9 194.3 225.1 199.3 217.3 200.5L98.98 217.9L184.9 303C190.4 308.5 192.9 316.4 191.6 324.1L171.4 443.7L276.6 387.5C283.7 383.7 292.2 383.7 299.2 387.5L404.4 443.7L384.2 324.1C382.9 316.4 385.5 308.5 391 303L476.9 217.9L358.6 200.5C350.7 199.3 343.9 194.3 340.5 187.2L287.9 78.95z"/></svg>
        <svg class="star empty" fill="#FFCE6A" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M287.9 0C297.1 0 305.5 5.25 309.5 13.52L378.1 154.8L531.4 177.5C540.4 178.8 547.8 185.1 550.7 193.7C553.5 202.4 551.2 211.9 544.8 218.2L433.6 328.4L459.9 483.9C461.4 492.9 457.7 502.1 450.2 507.4C442.8 512.7 432.1 513.4 424.9 509.1L287.9 435.9L150.1 509.1C142.9 513.4 133.1 512.7 125.6 507.4C118.2 502.1 114.5 492.9 115.1 483.9L142.2 328.4L31.11 218.2C24.65 211.9 22.36 202.4 25.2 193.7C28.03 185.1 35.5 178.8 44.49 177.5L197.7 154.8L266.3 13.52C270.4 5.249 278.7 0 287.9 0L287.9 0zM287.9 78.95L235.4 187.2C231.9 194.3 225.1 199.3 217.3 200.5L98.98 217.9L184.9 303C190.4 308.5 192.9 316.4 191.6 324.1L171.4 443.7L276.6 387.5C283.7 383.7 292.2 383.7 299.2 387.5L404.4 443.7L384.2 324.1C382.9 316.4 385.5 308.5 391 303L476.9 217.9L358.6 200.5C350.7 199.3 343.9 194.3 340.5 187.2L287.9 78.95z"/></svg>
        <svg class="star empty" fill="#FFCE6A" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><!--! Font Awesome Pro 6.2.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2022 Fonticons, Inc. --><path d="M287.9 0C297.1 0 305.5 5.25 309.5 13.52L378.1 154.8L531.4 177.5C540.4 178.8 547.8 185.1 550.7 193.7C553.5 202.4 551.2 211.9 544.8 218.2L433.6 328.4L459.9 483.9C461.4 492.9 457.7 502.1 450.2 507.4C442.8 512.7 432.1 513.4 424.9 509.1L287.9 435.9L150.1 509.1C142.9 513.4 133.1 512.7 125.6 507.4C118.2 502.1 114.5 492.9 115.1 483.9L142.2 328.4L31.11 218.2C24.65 211.9 22.36 202.4 25.2 193.7C28.03 185.1 35.5 178.8 44.49 177.5L197.7 154.8L266.3 13.52C270.4 5.249 278.7 0 287.9 0L287.9 0zM287.9 78.95L235.4 187.2C231.9 194.3 225.1 199.3 217.3 200.5L98.98 217.9L184.9 303C190.4 308.5 192.9 316.4 191.6 324.1L171.4 443.7L276.6 387.5C283.7 383.7 292.2 383.7 299.2 387.5L404.4 443.7L384.2 324.1C382.9 316.4 385.5 308.5 391 303L476.9 217.9L358.6 200.5C350.7 199.3 343.9 194.3 340.5 187.2L287.9 78.95z"/></svg>
      </div>
      <input class="comment-input" type="text" placeholder="Digite seu nome">
      <input class="comment-input" type="text" placeholder="Digite seu email">
      <textarea class="textarea" name="comment" id="comment" cols="30" rows="10" placeholder="Escreva um comentário"></textarea>
      <button class="comment-button" type="submit">Enviar</button>
    </form>
  </main>
</body>
</html>