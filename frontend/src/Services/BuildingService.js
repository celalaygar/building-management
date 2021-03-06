import ApiService from "./BaseService/ApiService";

const BUILDING_URL  = '/building';
const GET_BY_ID_URL  = '/get-by-id/'
class BuildingService {
    
    getBuilding(page, size){ 
        let url = '?page='+page+'&size='+size;
        return ApiService.get(BUILDING_URL+url);
    }

    get(url) { 
        return ApiService.get(BUILDING_URL+GET_BY_ID_URL+url)
    }
    // getUserByUsername(username){
    //     return ApiService.get(USER_URL+'/'+username)
    // }
    post(username, data) { 
        return ApiService.post(BUILDING_URL+"/"+username,data)
    }
    update(id, data) { 
        return ApiService.put(BUILDING_URL+"/"+id,data)
    }
    // update(username,body) { 
    //     return ApiService.put(USER_URL+"/"+username,body)
    // }
    // loadImage(username,body) { 
    //     return ApiService.put(USER_URL+"/upload-image/"+username,body)
    // }
    //put(url, data) { return axios.put(API_BASE_URL + url, data); }

    //delete(url) { return axios.delete(API_BASE_URL + url); }
}

export default new BuildingService();