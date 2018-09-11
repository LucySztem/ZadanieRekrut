$(document).ready(function(){

        var myHeaders = new Headers({
                    'content-type': 'application/json'
                })


        var btnToSend = document.querySelector('#btnToSend');
            btnToSend.addEventListener('click', function () {
                var numbers = $('#numbers').val();
                var order = $('#order').val();
            }

                var objToSend = {
                    numbers: numbers,
                    order: order,
                }

        var myInit = {
                     method: "POST",
                     headers: myHeaders,
                     mode: "cors",
                     cache: "default",
                     body: JSON.stringify(objToSend)
                 };

        fetch("http://localhost:8080/numbers/sort-command", myInit).then(function (response) {
           console.log(response);
        })})

