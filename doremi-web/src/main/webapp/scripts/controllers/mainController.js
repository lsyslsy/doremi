/**
 * 
 */
angular.module('doremi').config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/studentManage', {
		templateUrl : 'views/student.html'
	}).otherwise({
		redirectTo : '/'
	});
} ])

.controller('ctl', function($scope) {
//	$scope.king='fuck';
});