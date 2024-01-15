// modifySymptom
function agregarCampo(containerId, fieldName, maxCount) {
    var container = document.getElementById(containerId);
    var currentCount = container.querySelectorAll('input').length;

    if (currentCount < maxCount) {
        var nuevoInput = document.createElement('input');
        nuevoInput.type = 'text';
        nuevoInput.name = fieldName + '[' + currentCount + ']';

        // Crear el botón "-" junto al nuevo input
        var botonMenos = document.createElement('button');
        botonMenos.type = 'button';
        botonMenos.innerHTML = '-';
        botonMenos.onclick = function() {
            container.removeChild(nuevoInput);
            container.removeChild(botonMenos);
            container.removeChild(document.createElement('br'));
        };

        container.appendChild(nuevoInput);
        container.appendChild(botonMenos);
        container.appendChild(document.createElement('br'));
    } else {
        alert('¡No se pueden agregar más elementos!');
    }
}

window.onload = function() {
    // Asociar la función agregarCampo a los botones
    document.getElementById('caresBtn').onclick = function() {
        agregarCampo('caresContainer', 'cares', 3);
    };

    document.getElementById('considerationsBtn').onclick = function() {
        agregarCampo('considerationsContainer', 'considerations', 3);
    };

    // Agregar campos si ya existen datos al cargar la página (edición)
    var caresContainer = document.getElementById('caresContainer');
    var considerationsContainer = document.getElementById('considerationsContainer');

    if (caresContainer.childElementCount === 0) {
        agregarCampo('caresContainer', 'cares', 1);
    }

    if (considerationsContainer.childElementCount === 0) {
        agregarCampo('considerationsContainer', 'considerations', 1);
    }
};

function eliminarCampo(botonEliminar) {
    var container = botonEliminar.parentElement;
    container.removeChild(botonEliminar.previousElementSibling); // Eliminar el input
    container.removeChild(botonEliminar); // Eliminar el botón "-"
    container.removeChild(document.createElement('br')); // Eliminar el salto de línea
}