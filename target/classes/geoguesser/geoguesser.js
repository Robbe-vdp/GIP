import {Viewer} from 'mapillary-js';

const container = document.createElement('div');
container.style.width = '400px';
container.style.height = '300px';
document.body.appendChild(container);

const viewer = new Viewer({
  accessToken: '<MLY|7217306831693694|788545e191659d04e987d95d5d6d22c1>',
  container,
  imageId: '<your image ID for initializing the viewer>',
});