import angular from 'angular';
import uirouter from 'angular-ui-router';

import DonoController from './dono.controller';

export default angular.module('myApp.dono', [uirouter])
  .controller('DonoController', DonoController)
  .name;

  