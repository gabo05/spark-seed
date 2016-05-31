(function(app){
	app.service('seedService', [function(shapesFactory, canvasFactory, drawingFactory, valuesFactory){
        this.name = 'seed';
    }]);
})(angular.module('seedapp'));
