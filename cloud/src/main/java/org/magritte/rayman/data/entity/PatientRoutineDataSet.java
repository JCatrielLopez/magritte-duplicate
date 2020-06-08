package org.magritte.rayman.data.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "patientroutinedataset")
public class PatientRoutineDataSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Integer id;

    @ToString.Include
    @ManyToOne
    @JoinColumn(name = "idpatient")
    private Patient patient;

    @ToString.Include
    @ManyToOne
    @JoinColumn(name = "idroutine")
    private Routine routine;

    @ToString.Include
    @ManyToOne
    @JoinColumn(name = "iddataset")
    private DataSet dataSet;
}
