import angular from 'angular';
import uirouter from 'angular-ui-router';

import DonoController from './dono.controller';

import donoService from '../../servicos/dono.service';

export default angular.module('myApp.dono', [uirouter, donoService])
  .controller('DonoController', DonoController)
  .name;

  