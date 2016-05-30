(function(app){
	app.controller('seedController', ['$scope', '$http', function($scope, $http){
		this.info = {};
		self = this;
		$http.get('/home/hello')
				.then(function(response){
					self.info = response.data;
				});
	}]);
})(angular.module('seedapp'));