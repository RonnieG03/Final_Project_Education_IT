document.getElementById("loginBtn").addEventListener("click", function() {
    const username = document.getElementById("usernameInput").value;
    const password = document.getElementById("passwordInput").value;
    const data = { username: username, password: password };
    
    fetch("http://localhost:8080/api/v1/auth/login", {
      method: "POST",
      body: JSON.stringify(data),
      headers: {
        "Content-Type": "application/json"
      }
    })
    .then(response => response.json())
    .then(data => {
      if (data.success) {
        window.location.href = "dashboard.html";
      } else {
        // Mostrar un mensaje de error en el formulario de inicio de sesión
        document.getElementById("loginError").innerText = "Credenciales incorrectas. Intente de nuevo.";
      }
    })
    .catch(error => console.error(error));
  });