package org.magritte.rayman.rest.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.magritte.rayman.data.entity.DataSet;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class DataSetResponse {

    private Integer idDataSet;
    private Integer idPatient;
    private Integer idRoutine;
    private Date dateOfRealization;
    private Date dateOfData;
    private String dataType;
    private int measurement;
    private String unit;

    public DataSetResponse(DataSet dataSet) {
        this.idDataSet = dataSet.getId();
        this.idPatient = dataSet.getPatient().getId();
        this.idRoutine = dataSet.getRoutine().getIdRoutine();
        this.dateOfRealization = dataSet.getDateOfRealization();
        this.dateOfData = dataSet.getDateOfData();
        this.dataType = dataSet.getData().getDataType();
        this.measurement = dataSet.getMeasurement();
        this.unit = dataSet.getData().getUnit();
    }
}
