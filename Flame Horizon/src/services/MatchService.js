import axios from 'axios';
const http = axios.create({
    baseURL: "http://localhost:8080"
});

export default {

    list(puuid) {
        return http.get(`matches/list/${puuid}`);
    }
}