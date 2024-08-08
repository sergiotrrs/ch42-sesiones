import{n as d}from"./navbar-app-BsLDXIwH.js";import{d as i}from"./domainName-BqwKdE-m.js";const m=async e=>(await(await fetch(e)).json()).map(({firstName:r,lastName:n,avatar:a,serialNumber:c,email:l})=>`
                <div class="col-lg-3 col-md-4 col-sm-5">
                    <div class="card m-2 rounded shadow-sm">
                        <div class="card-body"><strong>${r} ${n}</strong></div>
                        <img src="${a}" class="card-img-top" alt="${r}">
                        <div class="card-body">${c}</div>
                        <div class="card-body">${l}</div>
                    </div>                
                </div>
            `).join("");document.querySelector("#navbar-app").innerHTML=d();const u=`${i()}/api/v2/users`,y=document.querySelector("#logout");y.addEventListener("click",e=>{localStorage.removeItem("userSesion"),window.location.href="/index.html"});const p=async e=>{const t=document.getElementById("loader");try{t.style.display="flex";const s=await m(e);document.querySelector("#list-container").innerHTML=s}catch(s){const o=document.getElementById("error-message");o.innerHTML=s,o.style.display="block",setTimeout(()=>o.style.display="none",5e3)}finally{t.style.display="none"}};p(u);
