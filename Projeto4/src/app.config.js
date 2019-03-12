routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'home'
      }
      $stateProvider.state(homeState);
      
      let donoState = {
        name: 'dono',
        url: '/dono',
        templateUrl: './modulos/dono/dono.view.html',
        controller: 'DonoController',
        controllerAs: 'dono'
      }
      $stateProvider.state(donoState);
      
      $urlRouterProvider.otherwise('/home')  
}