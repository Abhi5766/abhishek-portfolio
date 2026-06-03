import * as THREE from "three";

const scene = new THREE.Scene();

const camera = new THREE.PerspectiveCamera(
75,
window.innerWidth/window.innerHeight,
0.1,
1000
);

const renderer = new THREE.WebGLRenderer({
antialias:true
});

renderer.setSize(
window.innerWidth,
window.innerHeight
);

document.body.appendChild(renderer.domElement);

const geometry = new THREE.TorusKnotGeometry(3,1,100,16);

const material = new THREE.MeshStandardMaterial({
color:0xff00ff,
wireframe:true
});

const knot = new THREE.Mesh(
geometry,
material
);

scene.add(knot);

const light = new THREE.PointLight(
0xffffff,
2
);

light.position.set(5,5,5);

scene.add(light);

camera.position.z = 10;

function animate(){

requestAnimationFrame(animate);

knot.rotation.x += 0.01;
knot.rotation.y += 0.01;

renderer.render(scene,camera);

}

animate();