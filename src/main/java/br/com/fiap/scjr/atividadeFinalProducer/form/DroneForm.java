package br.com.fiap.scjr.atividadeFinalProducer.form;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DroneForm {

    @NotNull
    private Integer idDrone;

    @NotNull
    @Min(-90)
    @Max(90)
    private Integer latitude;

    @NotNull
    @Min(-180)
    @Max(180)
    private Integer longitude;

    @NotNull
    @Min(-25)
    @Max(40)
    private Integer temperatura;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer umidade;

    @NotNull
    private Boolean rastreamento;
    
}
