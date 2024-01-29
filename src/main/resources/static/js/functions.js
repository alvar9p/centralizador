function updateCaresAndConsiderations(index) {
  var selectedSymptomId = $("#symptomSelect" + index).val();

  // Obtener los valores de cares y considerations del elemento seleccionado
  var selectedOption = $("#symptomSelect" + index + " option:selected");
  var cares = selectedOption.data('cares');
  var considerations = selectedOption.data('considerations');

  // Actualizar los campos cares y considerations
  $("#caresDisplay" + index).val(cares);
  $("#considerationsDisplay" + index).val(considerations);
}

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

            <div class="row">

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
                        <select class="form-control" type="text" name="diseaseStage[${i - 1}].symptomName" id="symptomSelect${i}" onchange="updateCaresAndConsiderations(${i})">
                        <option value="">Selecciona un síntoma...</option>
                            ${symptoms.map((symptom) => `<option value="${symptom.idSymptom}"
                            data-cares="${symptom.cares}"
                            data-considerations="${symptom.considerations}">${symptom.symptomName}</option>`).join("")}
                         </select>
                         <label for="diseaseStage[${i - 1}].symptomName" class="form-label">Nombre del síntoma</label>
                    </div>


                    <div class="form-floating mb-3">
                        <input class="form-control" type="text" id="caresDisplay${i}" name="diseaseStage[${i - 1}].symptomCare" >
                        <label for="diseaseStage[${i - 1}].symptomCare" class="form-label">Cares:</label>
                    </div>

                    <div class="form-floating mb-3">
                        <input class="form-control" type="text" id="considerationsDisplay${i}" name="diseaseStage[${i - 1}].symptomConsideration" >
                        <label for="diseaseStage[${i - 1}].symptomConsideration" class="form-label">Considerations:</label>
                    </div>

                </div>

                <br>
            </div>

            <hr>
            `;
        formularioEtapas.appendChild(divEtapa);
        }
      }
    console.log("Cantidad de etapas selecionada: " + cantidadDeEtapas);
}