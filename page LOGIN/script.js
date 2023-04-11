var form = document.getElementById("login-form");

form.addEventListener("submit", function(event) {
  event.preventDefault();

    var email = form.elements["email"].value;
    var password = form.elements["password"].value;
          if("MATOVIATIONjeSUISunCHIENmonPATRONneVApasAIMER" == password){
            alert("Tu est sur c'est la ? (fait gaffe a ton pc !!!)");
            document.getElementById("le_texte").style.display = "block";
          } else {
            alert("Tu as rien trouvé bravo tu n'est pas du tout sur la bonne vois (mais fait gaffe tu as un piege pour ton pc )");
          }

});
