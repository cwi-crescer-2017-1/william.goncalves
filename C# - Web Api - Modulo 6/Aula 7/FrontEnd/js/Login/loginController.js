angular.module('editoraCwi').controller('loginController', function ($scope, authService) {

  $scope.login = function (usuario) {

    authService.login(usuario)
      .then(
        function (response) {
          console.log(response);
          alert('Login com sucesso!');
        },
        function (response) {
          console.log(response);
          alert('Erro no Login!');
        });
  };
});