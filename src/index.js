import { createElement } from 'lwc';
import NucleusspikeApp from 'nucleusspike/app';

const app = createElement('nucleusspike-app', { is: NucleusspikeApp });
// eslint-disable-next-line @lwc/lwc/no-document-query
document.querySelector('#main').appendChild(app);
