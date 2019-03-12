import { inherit } from "@uirouter/core";

export default class DonoController {

  constructor(donoService) {
    var vm = this;
    this.name = 'Dono';

    init();

    function init(){
      donoService.getDonos().then(function abc(resp) {
        vm.donos = resp.data;
      });
    }
  }
  
}
DonoController.$inject = ['donoService'];
