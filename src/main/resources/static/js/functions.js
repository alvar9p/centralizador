// JQuery para modifyDisease
$(document).ready(function () {
    $('#symptomName').change(function () {
        var selectedSymptomId = $(this).val();

        // Realizar solicitud AJAX al servidor
        $.ajax({
            type: 'GET',
            url: '/create/getCaresAndConsiderations/' + selectedSymptomId, // Ajusta la URL según tu configuración
            success: function (response) {
                // Actualizar la interfaz con los cuidados y consideraciones
                $('#cares').text(response.cares);
                $('#considerations').text(response.considerations);
            },
            error: function () {
                console.log('Error al obtener cuidados y consideraciones.');
            }
        });
    });
});

















// Añadiendo etapas
// formulario.js

function generarFormulario() {
    var cantidadEtapas = document.getElementById('cantidadEtapas').value;
    var formularioEtapas = document.getElementById('formularioEtapas');

    // Limpiar el formulario existente
    formularioEtapas.innerHTML = '';

    // Verificar si se seleccionó una cantidad válida
    if (cantidadEtapas > 0) {
        for (var i = 1; i <= cantidadEtapas; i++) {
            var divEtapa = document.createElement('div');
            var nombreEtapaValue = 'ETAPA_0' + i;
            divEtapa.innerHTML = `
                <hr>
                <h3>Etapa ${i}</h3>
                <label for="etapasEnf[${i - 1}].nombreIdentificador">Nombre Identificador:</label>
                <input type="text" name="etapasEnf[${i - 1}].nombreIdentificador" required/>
                <br/>

                <label for="etapasEnf[${i - 1}].nombreEtapa" style="visibility: hidden;">Nombre Etapa ${i}:</label>
                <input type="hidden" name="etapasEnf[${i - 1}].nombreEtapa" value="${nombreEtapaValue}" />

                <label for="etapasEnf[${i - 1}].descripcionEtapa">Descripción Etapa:</label>
                <input type="text" name="etapasEnf[${i - 1}].descripcionEtapa" required/>
                <br/>

                <label for="etapasEnf[${i - 1}].duracionEtapa">Duración Etapa:</label>
                <input type="number" id="duracionEtapa${i}" name="etapasEnf[${i - 1}].duracionEtapa" required onchange="calcularDuracionTotal()"/>
                <br/>

                <h4>Síntoma</h4>
                <label for="etapasEnf[${i - 1}].sintoma.sintoma">Síntoma:</label>
                <input type="text" name="etapasEnf[${i - 1}].sintoma.sintoma" required/>
                <br/>

                <label for="etapasEnf[${i - 1}].sintoma.cuidados">Cuidados:</label>
                <input type="text" name="etapasEnf[${i - 1}].sintoma.cuidados" required/>
                <br/>

                <label for="etapasEnf[${i - 1}].sintoma.consideraciones">Consideraciones:</label>
                <input type="text" name="etapasEnf[${i - 1}].sintoma.consideraciones" required/>
                <br/>

                <label for="etapasEnf[${i - 1}].sintoma.obligatoriedad">Obligatoriedad:</label>
                <input type="checkbox" name="etapasEnf[${i - 1}].sintoma.obligatoriedad"/>
                <br/>
            `;
            formularioEtapas.appendChild(divEtapa);
        }
    }
    // Inicializar la duración total después de agregar todas las etapas
    calcularDuracionTotal();
}

function calcularDuracionTotal() {
    var duracionTotal = 0;
    var cantidadEtapas = document.getElementById('cantidadEtapas').value;

    // Sumar las duraciones de todas las etapas
    for (var i = 1; i <= cantidadEtapas; i++) {
        var duracionEtapa = parseInt(document.getElementById(`duracionEtapa${i}`).value) || 0;
        duracionTotal += duracionEtapa;
    }

    // Establecer la duración total en el campo fuera del formulario
    document.getElementById('duracionEnf').value = duracionTotal;
}

// ************************************************************************ //

function eliminarCampo(botonEliminar) {
    var container = botonEliminar.parentElement;
    container.removeChild(botonEliminar.previousElementSibling); // Eliminar el input
    container.removeChild(botonEliminar); // Eliminar el botón "-"
    container.removeChild(document.createElement('br')); // Eliminar el salto de línea
}

