import{n as d}from"./navbar-app-BsLDXIwH.js";import{d as n}from"./domainName-BqwKdE-m.js";const i=async t=>{const s=await fetch(t);if(s.status!==200)throw(await s.json()).message;return(await s.json())._embedded.products.map(({name:e,image:a,price:c})=>`
                <div class="col-lg-3 col-md-4 col-sm-5">
                    <div class="card m-2 rounded shadow-sm">
                        <div class="card-body"><strong>${e} </strong></div>
                        <img src="${a}" class="card-img-top" alt="${e}">
                        <div class="card-body">$ ${c} M.N.</div>
                    </div>                
                </div>
            `).join("")};document.querySelector("#navbar-app").innerHTML=d();const l=`${n()}/api/v3/products`,m=async t=>{const s=document.getElementById("loader");try{s.style.display="flex";const r=await i(t);document.querySelector("#list-container").innerHTML=r}catch(r){const o=document.getElementById("error-message");o.innerHTML=r,o.style.display="block",setTimeout(()=>o.style.display="none",5e3)}finally{s.style.display="none"}};m(l);
