
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {sno:'1',name:'Rahul',brand:'Raymonds',categrory:'Matress'},
        {sno:'2',name:'Deepak',brand:'Vanhussion',categrory:'Bedsheed'},
        {sno:'3',name:'Harish',brand:'Safari',categrory:'2by2Matress'},
        {sno:'4',name:'Nawaz',brand:'Mayur',categrory:'Blanket'},
        {sno:'5',name:'Pravash',brand:'Handloom',categrory:'Bedsheedcover'},
        
        ];
    $scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
});