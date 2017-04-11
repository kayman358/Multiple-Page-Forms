/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var pageContents = [
  ['#exampleVendorName', '#exampleInputEmail1'],
  ['#exampleProjectManager', '#exampleProjectManager1']
];

function classAssigner(element, classNameParam) {
  //finds the element and assigns it the proper class, or an empty string
  var curElement = document.querySelector(element);
  curElement.className = classNameParam;
}

//this function gets called dueto the onclick attribute in the html on the button
function pageChanger(curPage, nextPage, pageContentArray) {
  //calls classAssigner for each item in the curPage index of the pageContent array
  pageContentArray[curPage].forEach(function(element) {
    classAssigner(element, 'hidden')
  });
  
  //calls classAssigner for each item in the nextPage index of the pageContent array
  pageContentArray[nextPage].forEach(function(element) {
    classAssigner(element, 'form-control short')
  });
}
