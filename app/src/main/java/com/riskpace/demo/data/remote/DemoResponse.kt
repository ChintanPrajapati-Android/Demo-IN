package com.riskpace.demo.data.remote

import com.google.gson.annotations.SerializedName


data class DemoResponse(
    @SerializedName("problems")
    val problems: List<Problem>
)

data class Problem(
    @SerializedName("Asthma")
    val asthma: List<Asthma>,
    @SerializedName("Diabetes")
    val diabetes: List<Diabete>
)

class Asthma(
)

data class Diabete(
    @SerializedName("labs")
    val labs: List<Lab>,
    @SerializedName("medications")
    val medications: List<Medication>
)

data class Lab(
    @SerializedName("missing_field")
    val missingField: String
)

data class Medication(
    @SerializedName("medicationsClasses")
    val medicationsClasses: List<MedicationsClasse>
)

data class MedicationsClasse(
    @SerializedName("className")
    val className: List<ClassName>,
    @SerializedName("className2")
    val className2: List<ClassName2>
)

data class ClassName(
    @SerializedName("associatedDrug")
    val associatedDrug: List<AssociatedDrug>,
    @SerializedName("associatedDrug#2")
    val associatedDrug2: List<AssociatedDrug2>
)

data class ClassName2(
    @SerializedName("associatedDrug")
    val associatedDrug: List<AssociatedDrugX>,
    @SerializedName("associatedDrug#2")
    val associatedDrug2: List<AssociatedDrug2X>
)

data class AssociatedDrug(
    @SerializedName("dose")
    val dose: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("strength")
    val strength: String
)

data class AssociatedDrug2(
    @SerializedName("dose")
    val dose: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("strength")
    val strength: String
)

data class AssociatedDrugX(
    @SerializedName("dose")
    val dose: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("strength")
    val strength: String
)

data class AssociatedDrug2X(
    @SerializedName("dose")
    val dose: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("strength")
    val strength: String
)