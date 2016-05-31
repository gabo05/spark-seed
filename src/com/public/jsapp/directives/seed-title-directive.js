(function(app){
	app.directive('seedTitle', [function(){
        return{
            restrict: 'E',
            scope: {
                text: '='
            },
            templateUrl: 'jsapp/templates/tmpl-seed-title.html',
            controllerAs: 'title',
            controller: function(){
                this.text = '';
            },
            link: function(scope, element, attrs){

            }
        };
    }]);
})(angular.module('seedapp'));
