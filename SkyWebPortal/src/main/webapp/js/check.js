(function($) {
  
  "use_strict";
  
  // This array will store the values of the "checked" checkboxes
  var cboxArray = [];
        
  function itemExistsChecker(cboxValue) {
          
    var len = cboxArray.length;
          
    if (len > 0) {
      for (var i = 0; i < len; i++) {
        if (cboxArray[i] == cboxValue) {
          return true;
        }
      }
    }
          
    cboxArray.push(cboxValue);
  } 
        
  $('input[type="checkbox"]').each(function() {
          
    var cboxValue = $(this).val();
    var cboxChecked = localStorage.getItem(cboxValue) == 'true' ? true : false;
          
    // On page load check if any of the checkboxes has previously been selected and mark it as "checked"
    if (cboxChecked) {
 
      $(this).prop('checked', true);
      itemExistsChecker(cboxValue);
 
    }
        
    $(this).change(function() {
      
      localStorage.setItem(cboxValue, $(this).is(':checked'));
            
      if ($(this).is(':checked')) {
 
        itemExistsChecker(cboxValue);
 
      } else {
 //unchecking
        var cboxValueIndex = cboxArray.indexOf(cboxValue);
        
        if (cboxValueIndex >= 0) {
          cboxArray.splice( cboxValueIndex, 1 );
        }
              
      }
            
      console.log('array ' ,cboxArray);
            
    });
 
  });
        
  console.log('arrays ',cboxArray);
        
})(jQuery);