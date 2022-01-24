package com.example.mobiuz.models

class TarifData {
    var tarif_name: String? = null
    var tarif_cost: String? = null
    var tarif_minute: String? = null
    var tarif_mb: String? = null
    var tarif_sms: String? = null

    constructor(tarif_name:String?,tarif_cost: String?, tarif_minute: String?, tarif_mb: String?, tarif_sms: String?) {
        this.tarif_name = tarif_name
        this.tarif_cost = tarif_cost
        this.tarif_minute = tarif_minute
        this.tarif_mb = tarif_mb
        this.tarif_sms = tarif_sms
    }
}