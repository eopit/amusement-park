axios
  .get("https://api.github.com/users/eopit")
  .then(function(response) {
    console.log(response);
  })
  .catch(function(error) {
    console.warn("deu erro");
  });
