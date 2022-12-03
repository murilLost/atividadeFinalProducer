package br.com.fiap.scjr.atividadeFinalProducer.form;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

@Getter
@Setter
public class DroneForm {

    @NotNull(message = "idDrone nao pode ser nulo, deve ser numero inteiro")
    private Integer idDrone;

    @NotNull(message = "latitude nao pode ser nula, deve ser numero inteiro")
    @Min(value = -90, message = "latitude minima de -90")
    @Max(value = 90, message = "latidude maxima de 90")
    private Integer latitude;

    @NotNull(message = "longitute nao pode ser nula, deve ser numero inteiro")
    @Min(value = -180, message = "longitude minima de -180")
    @Max(value = 180, message = "longitude maxima de 180")
    private Integer longitude;

    @NotNull(message = "temperatura nao pode ser nula, deve ser numero inteiro")
    @Min(value = -25, message = "temperatura minima de -25")
    @Max(value = 40, message = "temperatura maxima de 40")
    private Integer temperatura;

    @NotNull(message = "umidade nao pode ser nula, deve ser numero inteiro")
    @Min(value = 0, message = "umidade minima de 0")
    @Max(value = 100, message = "umidade maxima de 100")
    private Integer umidade;

    @NotNull(message = "rastreamento nao pode ser nulo, deve ser boolean")
    private Boolean rastreamento;
    
}