// JQuery para modifyDisease
$(document).ready(function () {
  $("#symptomName").change(function () {
    var selectedSymptomId = $(this).val();

    // Realizar solicitud AJAX al servidor
    $.ajax({
      type: "GET",
      url: "/create/getCaresAndConsiderations/" + selectedSymptomId, // Ajusta la URL según tu configuración
      success: function (response) {
        // Actualizar la interfaz con los cuidados y consideraciones
        $("#cares").text(response.cares);
        $("#caresInput").val(response.cares);

        $("#considerations").text(response.considerations);
        $("#considerationsInput").val(response.considerations);
      },
      error: function () {
        console.log("Error al obtener cuidados y consideraciones.");
      },
    });
  });
});


function generarFormulario() {
    var cantidadDeEtapas = document.getElementById("numberOfStages").value;
    var formularioEtapas = document.getElementById("stagesForm");

    formularioEtapas.innerHTML = ""; // Limpiar el formulario existente

    if (cantidadDeEtapas > 0) {
        for (var i = 1; i <= cantidadDeEtapas; i++) {
            var divEtapa = document.createElement("div");
            var nombreEtapa = "ETAPA_0" + i;
            divEtapa.innerHTML = `
              <hr>
              <h3>Trabajando en Etapa ${i}</h3>

              <div class="col-6 mt-3">

                  <div class="form-floating mb-3">
                      <input class="form-control" type="hidden" name="diseaseStage[${i - 1}].StageID" value="${nombreEtapa}" readonly />
                      <label for="diseaseStage[${i - 1}].StageID" style="visibility: hidden;">Nombre Etapa ${i}:</label>
                  </div>

                  <div class="form-floating mb-3">
                        <input class="form-control" type="text" name="diseaseStage[${i - 1}].stageIdentifier" />
                        <label for="diseaseStage[${i - 1}].stageIdentifier">Nombre</label>
                  </div>

                  <div class="form-floating mb-3">
                        <input class="form-control" type="text" name="diseaseStage[${i - 1}].stageDesc" />
                        <label for="diseaseStage[${i - 1}].stageDesc">Descripcion</label>
                  </div>

                  <div class="form-floating mb-3">
                        <input class="form-control" type="number" name="diseaseStage[${i - 1}].duration" />
                        <label for="diseaseStage[${i - 1}].duration">Duracion</label>
                  </div>

              </div>

              <div class="col-6 mt-3">

                   <div class="form-floating mb-3">
                        <p>Texto </p>
                   </div>



              </div>


              <br>
              <hr>

      `;
      formularioEtapas.appendChild(divEtapa);
    }
  }

  console.log("Cantidad de etapas selecionada: " + cantidadDeEtapas);
}
