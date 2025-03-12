import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import guoshuxinxiList from '../pages/guoshuxinxi/list'
import guoshuxinxiDetail from '../pages/guoshuxinxi/detail'
import guoshuxinxiAdd from '../pages/guoshuxinxi/add'
import guoshuleixingList from '../pages/guoshuleixing/list'
import guoshuleixingDetail from '../pages/guoshuleixing/detail'
import guoshuleixingAdd from '../pages/guoshuleixing/add'
import shifeiList from '../pages/shifei/list'
import shifeiDetail from '../pages/shifei/detail'
import shifeiAdd from '../pages/shifei/add'
import jiaoshuiList from '../pages/jiaoshui/list'
import jiaoshuiDetail from '../pages/jiaoshui/detail'
import jiaoshuiAdd from '../pages/jiaoshui/add'
import caizhaiList from '../pages/caizhai/list'
import caizhaiDetail from '../pages/caizhai/detail'
import caizhaiAdd from '../pages/caizhai/add'
import guoshushengchandiList from '../pages/guoshushengchandi/list'
import guoshushengchandiDetail from '../pages/guoshushengchandi/detail'
import guoshushengchandiAdd from '../pages/guoshushengchandi/add'
import yunshuzhuizongList from '../pages/yunshuzhuizong/list'
import yunshuzhuizongDetail from '../pages/yunshuzhuizong/detail'
import yunshuzhuizongAdd from '../pages/yunshuzhuizong/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussguoshuxinxiList from '../pages/discussguoshuxinxi/list'
import discussguoshuxinxiDetail from '../pages/discussguoshuxinxi/detail'
import discussguoshuxinxiAdd from '../pages/discussguoshuxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'guoshuxinxi',
					component: guoshuxinxiList
				},
				{
					path: 'guoshuxinxiDetail',
					component: guoshuxinxiDetail
				},
				{
					path: 'guoshuxinxiAdd',
					component: guoshuxinxiAdd
				},
				{
					path: 'guoshuleixing',
					component: guoshuleixingList
				},
				{
					path: 'guoshuleixingDetail',
					component: guoshuleixingDetail
				},
				{
					path: 'guoshuleixingAdd',
					component: guoshuleixingAdd
				},
				{
					path: 'shifei',
					component: shifeiList
				},
				{
					path: 'shifeiDetail',
					component: shifeiDetail
				},
				{
					path: 'shifeiAdd',
					component: shifeiAdd
				},
				{
					path: 'jiaoshui',
					component: jiaoshuiList
				},
				{
					path: 'jiaoshuiDetail',
					component: jiaoshuiDetail
				},
				{
					path: 'jiaoshuiAdd',
					component: jiaoshuiAdd
				},
				{
					path: 'caizhai',
					component: caizhaiList
				},
				{
					path: 'caizhaiDetail',
					component: caizhaiDetail
				},
				{
					path: 'caizhaiAdd',
					component: caizhaiAdd
				},
				{
					path: 'guoshushengchandi',
					component: guoshushengchandiList
				},
				{
					path: 'guoshushengchandiDetail',
					component: guoshushengchandiDetail
				},
				{
					path: 'guoshushengchandiAdd',
					component: guoshushengchandiAdd
				},
				{
					path: 'yunshuzhuizong',
					component: yunshuzhuizongList
				},
				{
					path: 'yunshuzhuizongDetail',
					component: yunshuzhuizongDetail
				},
				{
					path: 'yunshuzhuizongAdd',
					component: yunshuzhuizongAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussguoshuxinxi',
					component: discussguoshuxinxiList
				},
				{
					path: 'discussguoshuxinxiDetail',
					component: discussguoshuxinxiDetail
				},
				{
					path: 'discussguoshuxinxiAdd',
					component: discussguoshuxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
