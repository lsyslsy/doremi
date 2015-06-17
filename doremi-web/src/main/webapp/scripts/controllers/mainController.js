/**
 * 
 */
angular.module('doremi').config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/manageStudents', {
		templateUrl : 'views/student.html'
	}).otherwise({
		redirectTo : '/'
	});
} ])

.controller('ctl', function($scope) {
	$scope.king='fuck';
});