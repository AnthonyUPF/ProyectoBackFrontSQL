const loginForm = document.getElementById("login-form");

loginForm.addEventListener("submit", function (event) {
  event.preventDefault();

  const formData = new FormData(loginForm);

  const user = {
    email: loginForm.elements.email.value,
    password: loginForm.elements.password.value,
  };

  fetch(
    `http://localhost:8080/api/login?email=${user.email}&password=${user.password}`,
    {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    }
  )
  .then(response => response.json())
	.then(data => {
		console.log('Success:', data);
    	
      if (data[0][0] == user.email && data[0][1] == user.password) {
        console.log("Valido");
        window.location.href = "indexLogin.html";
      } else {
        console.log("NO");
      }
    })
    .catch((error) => {
      console.error(error);
    });
});