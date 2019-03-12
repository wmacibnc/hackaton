import angular from 'angular';

class DonoService {

    constructor($http) {
        this.$http = $http;
        const apiBase = "http://localhost:8080/projeto3/api/";
        this.path =  apiBase + "dono";
    }
    
    getDonos() {
        return this.$http.get(this.path);
    }
}

export default angular.module('services.dono-service', [])
.service('donoService', DonoService)
.name;