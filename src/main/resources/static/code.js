document.addEventListener("DOMContentLoaded", function() {
    // Selecciona el botón de agregar
    var addButton = document.getElementById("agregar");

    // Selecciona el contenedor de divs
    var container = document.getElementById("container");

    // Agrega un evento al botón de agregar
    addButton.addEventListener("click", function() {
        // Crea dos nuevos divs para nombre y apellido
        var newDiv = document.createElement("div");

        var nombreDiv = document.createElement("div");
        nombreDiv.innerHTML = '<span>Nombre</span><input type="text" name="nombre" />';

        var apellidoDiv = document.createElement("div");
        apellidoDiv.innerHTML = '<span>Apellido</span><input type="text" name="apellido" />';

        // Agrega los nuevos divs al contenedor
        newDiv.appendChild(nombreDiv);
        newDiv.appendChild(apellidoDiv);

        container.appendChild(newDiv);
    });
});