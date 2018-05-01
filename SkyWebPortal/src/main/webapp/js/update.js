var category = [];
$(".ckbox").click(function() {
      if($(this).is(":checked")) {
        category.push($(this).val());
      } else {
        var x = category.indexOf($(this).val());
        category.splice(x, 1);
      } 
    });