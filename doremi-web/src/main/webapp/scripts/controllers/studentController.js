/**
 * 
 */

angular.module("doremi.studentModule")

.controller('StudentController', ['$scope', '$http', function($scope, $http) {
	$scope.student = 'testOne';
	$scope.students =[];
	params=[];
	$http({
		url : "StudentManage/ViewStudents.json",
		params : params,
		method : "GET"
	}).success(function(data, status, headers, config) {
		$scope.students = data;
	});
}]);